package z.practice_oop.ex6;


public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	
	
	
	public MemberController() {
		m[0] = new Member("user01","김지원","pass01","jw1@naver.com",'m',35);
		m[1] = new Member("user02","최지원","pass02","jw1@naver.com",'m',14);
		m[2] = new Member("user03","이지원","pass03","jw1@naver.com",'f',18);
		m[3] = new Member("user04","박지원","pass04","jw1@naver.com",'f',25);
		
	}

	public int existMemberNum() {
		int count = 0;
		for(int i = 0 ; i < m.length; i++) {
			if(m[i] != null) {
				count++;
			}
		}
		return count;
	}
	
	//cheak하고자하는 id를 넘겨받아 배열 m에 해당id를 사용하는 Member가 있는지 검사
	//중복된 id가 있을 경우 사용불가 -> return false
	//중복된 id가 없을 경우 사용가능 -> return true
	public Boolean checkId(String inputId) {
		/*
		Boolean check = false;
		for(int i = 0; i<m.length; i++) {
			if(m[i].getId() != inputId) {
				check = true;
			}else {
				check = false;
			}
		}
		return check;
		*/
		for(Member mem : m) {
			if(mem == null) { //null이 나올때까지 찾았는데 못찾음
				return true;
			}
			if(mem.getId().equals(inputId)) {//
				return false;
			}
		}
		return true;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for(int i =0; i<m.length; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name,password, email, gender, age);
				return;
			}
			
		}
	}
	
	//존재하면 검색된 회원의 정보를 return
	public String searchId(String id) {
		/*
		String search = null;
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId() == id) {
				search = m[i].inform();
				break;
			}
		}
		return search;
		*/
		
		for(Member mem : m) {
			if(mem == null) {
				return null;
			}else if(mem.getId().equals(id)) {
				return mem.inform();
			}
		}
		return null;
	}
	
	//존재하면 검색된 회원의 정보를 return	
	public Member[] searchName(String name) {
		/*
		for(int i=0; i < m.length; i++) {
			if(m[i].getName().equals(name)) {
				m[i].inform();
				break;
			}
		}
		return m;
		*/
		Member[] mArr = new Member[SIZE];
		int index = 0;
		
		for(Member mem : m) {
			if(mem == null) {
				break;
			}
			if(mem.getName().equals(name)) { //동일한 이름을 찾음
				mArr[index++] = mem;
			}
		}
		return mArr;
	}
	
	public Member[] searchEmail(String email) {
		/*
		for(int i = 0; i < m.length; i++) {
			if(m[i].getEmail().equals(email)) {
				m[i].inform();
				break;
			}
		}
		return m;
		*/
		Member[] mArr = new Member[SIZE];
		int index = 0;
		
		for(Member mem : m) {
			if(mem == null) {
				break;
			}
			if(mem.getName().equals(email)) {
				mArr[index++] = mem;
			}
		}
		
		return mArr;
		
	}
	
	//변경 성공했으면 true
	//변경 실패하면 false
	public Boolean updatePassword(String id, String password) {
		/*
		Boolean update = false;
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId().equals(id)) {
				m[i].setPassword(password);
				update = true;
				break;
			}
		}
		return update;
		*/
		for(Member mem : m) {
			if(mem == null) {
				return false;
			}else if(mem.getId().equals(id)) {
				mem.setPassword(password);
				return true;
			}
		}
		return false;
	}
	
	public Boolean updateName(String id, String name) {
		/*
		Boolean update = false;
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId().equals(id)) {
				m[i].setName(name);
				update = true;
				break;
			}
		}
		return update;
		*/
		for(Member mem : m) {
			if(mem == null) {
				return false;
			}else if(mem.getName().equals(name)) {
				mem.setName(name);
				return true;
			}
		}
		return false;
	}
	
	public Boolean updateEmail(String id, String email) {
		/*
		Boolean update = false;
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId().equals(id)) {
				m[i].setEmail(email);
				update = true;
				break;
			}
		}
		return update;
		*/
		
		for(Member mem : m) {
			if(mem == null) {
				return false;
			}else if(mem.getEmail().equals(email)) {
				mem.setEmail(email);
				return true;
			}
		}
		return false;
	}
	
	//특정 id를 찾아서 삭제
	//id를 못찾으면 return false;
	public Boolean delete(String id) {
		/*
		Boolean update = false;
		for(int i=0; i<m.length;i++) {
			if(m[i].getId().equals(id)) {
				m[i] = null;
				update = true;
				break;
			}
		}
		return update;
		*/
		for(int i = 0; i< m.length; i++) {
			if(m[i] == null) {
				return false;
			}else if(m[i].getId().equals(id)) {
				
				//i요소의 null이 대입되었기 때문에 뒤에있는 요소에는 값이 있으면 안됨.
				//그래서 i요소에 null을 넣는 것이 아니라 뒤에 요소를 하나씩 앞으로 당겨준다.
				//발견한요소 ~ 맨마지막요소(null이 아닌요소)
				for(int j = i; j < m.length; j++) {
					if(j == m.length -1 ) {//마지막요소는 다음요소가 없기 때문에 null을 직접대입한다.
						m[j] = null;
						break;
					}else if(m[j] == null) {
						break;
					}
					m[j] = m[j+1];
				}
				return true;
			}
		}
		return false;
		
	}
	
	public void delete() {
		//this.m = new Member[SIZE];
		
		for(int i=0; i<m.length; i++) {
			m[i] = null;
		}
	}
	
	public Member[] printAll() {
	
		return m;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
