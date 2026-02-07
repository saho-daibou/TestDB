
public class Test {

	public static void main(String[]args) {
		TestUserDAO dao = new TestUserDAO();
		dao.select("taro","123");
		
		//演習⑥全行表示
		dao.selectAll();
		
		//演習⑧名前を指定して追加
		dao.selectByName("taro");
	}
}
