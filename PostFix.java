import java.util.Scanner;
public class PostFix
{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter infix: ");
        String infix=sc.nextLine().trim();
        
        String oper[]={"^","/","*","+","-"};
        int prior[]={2,1,1,0,0};
        char eq[]=infix.toCharArray();
        
        int no_ops=0;
        for(int x=0; x<eq.length; x++){
            for(int y=0; y<oper.length; y++){
                if(Character.toString(eq[x]).equals(oper[y])){
                    no_ops++;
                }
            }
        }
        
        for(int x=0; x<no_ops; x++){
            
        }
    }
}
