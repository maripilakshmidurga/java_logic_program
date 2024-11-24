import java.util.*;

public class Membership {

	public static void main(String[] args) {
		
				Set<String> hashset=new HashSet<String>();
				Set<String> linkedhashset=new LinkedHashSet<String>();
				Set<String> treeset=new TreeSet<String>();
				Scanner sc=new Scanner(System.in);
				int choice;
				String member;
				do
				{
				System.out.println("1.Add Member");
				System.out.println("2.Display member Hashset");
				System.out.println("3.Display member linkedHashset");
				System.out.println("4.Display member treeset");
				System.out.println("5.check member");
				System.out.println("6.Delete member");
				
				System.out.println("Enter you choice:");
				choice=sc.nextInt();
				
				switch(choice)
				{
				case 1:
				    System.out.println("Enter member name to membership:");
				    member=sc.next();
				    hashset.add(member);
				    linkedhashset.add(member);
				    treeset.add(member);
				    System.out.println("Members Added Successfully");
				    break;
				case 2:
					System.out.println("display hashset List :"+hashset);
					break;
				case 3:
					System.out.println("display linkedhashset List :"+linkedhashset);
					break;
				case 4:
					System.out.println("display Treeset List :"+treeset);
					break;
				case 5:
					System.out.println("Enter member:");
				    member=sc.next();
					if(hashset.contains(member)|| linkedhashset.contains(member))
					{
						System.out.println("member is Avilable in List");
					}
					else
					{
						System.out.println("member is Not Found");
					}
					break;
				case 6:
					System.out.println("member delete to membership:");
					member=sc.next();
					hashset.contains(member);
					System.out.println("member Remove Successfully");
					break;
					default:
						System.out.println("Invalid Option");
				}
				}
				while(choice<7);
			}

	}
