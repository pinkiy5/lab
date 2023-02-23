package thrusdaylab_23feb;
class Sports{  //parent class
    String getName(){
        return "Generic Sports";
         }

   void getNumberOfTeamMembers(){
         System.out.println( "Each team has n players in " + getName() );
 }}
class Soccer extends Sports{  //child class
    @Override
    String getName(){
     return "Soccer Class";
    }
    void getNumberOfTeamMembers(){
    	int n = 11;
        System.out.println( "Each team has "+ n+" players in " + getName() );
    
     }}

public class Third {  //main class
	public static void main(String[] args) {
		Sports a = new Sports();
		System.out.println(a.getName());
		a.getNumberOfTeamMembers();

		Soccer s = new Soccer();
		System.out.println(s.getName());
		s.getNumberOfTeamMembers();
	}

}
