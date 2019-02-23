import java.util.Scanner;
public class PostFix
{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter infix: ");
        String infix=sc.nextLine().trim();

        char oper[]={'^','/','*','+','-'};
        int prior[]={2,1,1,0,0};
        char eq[]=infix.toCharArray();

        Stack s=new Stack(operators(oper, eq));
        String postfix="";

        for(int x=0; x<infix.length(); x++){
            if(equalsOperator(eq[x], oper)){
                if(s.isEmpty()){
                    s.push(Character.toString(eq[x]));
                }
                else{
                    if(heirarchy(s.peek(), prior, eq[x], oper)>=0){
                        postfix+=s.peek();
                        s.pop();
                        s.push(Character.toString(eq[x]));
                        
                    }
                }
            }
            else{
                postfix+=Character.toString(eq[x]);
            }
        }
        System.out.println(postfix);
        s.display();
    }

    public static int operators(char oper[], char eq[]){
        int no_ops=0;

        for(int x=0; x<eq.length; x++){
            for(int y=0; y<oper.length; y++){
                if(eq[x]==oper[y]){
                    no_ops++;
                }
            }
        }

        return no_ops;
    }

    public static boolean equalsOperator(char eq, char oper[]){
        boolean flag=false;
        for(int x=0; x<oper.length; x++){
            if(oper[x]==eq){
                flag=true;
            }
        }
        return flag;
    }
    
    public static int heirarchy(String prev, int prior[], char now, char oper[]){
        int prevheir=0, nowheir=0;
        for(int x=0; x<oper.length; x++){
            if(Character.toString(oper[x]).equals(prev)){
                prevheir=prior[x];
            }
        }
        for(int x=0; x<oper.length; x++){
            if(oper[x]==now){
                nowheir=prior[x];
            }
        }
        return prevheir-nowheir;
    }
}
