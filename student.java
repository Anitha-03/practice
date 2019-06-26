package wavelabsbasicprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class MainStudent 
{

	public static void main(String[] args)
	{
		ArrayList<StudentEnroll> li=new ArrayList<>();
		li.add(new StudentEnroll("vinod",67567,"20-08-1996","1AY15CS423"));
		li.add(new StudentEnroll("koudinya",7896,"10-01-1997","1AY15CS420"));
		li.add(new StudentEnroll("Machindra",8976,"24-09-1996","1AY15CS427"));
		li.add(new StudentEnroll("kumar",6543,"20-10-1995","1AY15CS403"));
		
		li.add(new StudentEnroll("Anitha",5437,"19-05-1996","1AY15CS001"));
		li.add(new StudentEnroll("Bhavani Ambalagi",6543,"14-08-1997","1AY15CS002"));
		System.out.println(" student details are");
		Iterator i=li.iterator();
		while(i.hasNext())
		{
			Object name=i.next();
			StudentEnroll s=(StudentEnroll)name;
			System.out.println(" Enter the usn to be searched");
			
			System.out.println((" name="+s.name));
			System.out.println((" name="+s.pnumber));
			System.out.println((" name="+s.date));
			System.out.println((" name="+s.usn));
			
		}
		
		
		
		
		
		
	}

}

