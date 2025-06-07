private SessionFactory factory;

public UserDao(SessionFactory factory) {
    this.factory = factory;
}
public User getUserByUserNameAndPassword(String username, String password) {
    User user = null;
    try {
        String query = "from User where userName = :usr and userPassword = :pwd";
        Session session = this.factory.openSession();

        Query q = session.createQuery(query);
        q.setParameter("usr", username);
        q.setParameter("pwd", password);

        user = (User) q.uniqueResult();  // returns the user object if credentials match
        session.close();
    } catch (Exception e) {
        System.out.println(e);
    }
    return user;
}
