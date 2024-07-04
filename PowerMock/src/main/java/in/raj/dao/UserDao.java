package in.raj.dao;

public interface UserDao {
     String findNameById(Integer id);

     boolean findByEmailAndPwd(String email, String pwd);
}
