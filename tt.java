
public class MainMenu
{
    public static void subMenu()
    {
        int s_choice = 1;
        do
        {
            System.out.println("1. Clerk");
		    System.out.println("2. Programmer");
		    System.out.println("3. manager");
		    System.out.println("4. Exit");
		    System.out.print("Enter choice : ");
		    s_choice = sc.nextInt();
		    sc.nextLine();
		    switch(s_choice)
		    {
		        case 1:
		            break;
		        case 2:
		            //Display
		            break;
		        case 3:
		            //Raise
		            break;
		        case 4:
		            //Exit
		            break;
		    }
            
        }while(s_choice!=4);
    }
    
	public static void main(String[] args) {
		int m_choice = 1;
		public static count = 0;
		public static ArrayList<Clerk> c_arr = new ArrayList<Clerk>();
		public static ArrayList<Programmer> p_arr = new ArrayList<Programmer>();
		public static ArrayList<Manager> m_arr = new ArrayList<Manager>();
		do
		{
		    System.out.println("1. Create");
		    System.out.println("2. Display");
		    System.out.println("3. Raise Salary");
		    System.out.println("4. Exit");
		    System.out.print("Enter choice : ");
		    m_choice = sc.nextInt();
		    sc.nextLine();
		    switch(m_choice)
		    {
		        case 1:
		            break;
		        case 2:
		            //Display
		            break;
		        case 3:
		            //Raise
		            break;
		        case 4:
		            //Exit
		            break;
		    }
		}while(m_choice!=4)
		
	}
}
