public class LinkedList
{
    Node first, last, curr, prev;
    public void insert(double val){
        Node newnode=new Node(val);
        if(first==null){
            first=newnode;
            last=newnode;
        }
        else{
            if(newnode.data<first.data){
                newnode.next=first;
                first=newnode;
            }
            else if(newnode.data>last.data){
                last.next=newnode;
                last=newnode;
            }
            else{
                curr=first;
                prev=curr;
                curr=curr.next;
                while(curr!=null){
                    if((newnode.data>prev.data)&&(newnode.data<curr.data)){
                        prev.next=newnode;
                        newnode.next=curr;
                        break;
                    }
                    else{
                        prev=curr;
                        curr=curr.next;
                    }
                }
            }
        }
    }
    
    public void delete(int index){
        curr=first;
        prev=curr;
        int at=-1;
        if(index<0){
            System.out.println("No index found");
        }else{
            while(curr!=null){
                at++;
                if(at==index){
                    prev.next=curr.next;
                    break;
                }
                if(curr.next==null){
                    System.out.println("Index not available");
                    break;
                }
                else{
                    prev=curr;
                    curr=curr.next;
                }
            }
        }
    }

    public void get(){
        //returns everything
        curr=first;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }

    public void get(int index){
        //returns specific data at index "index"
        curr=first;
        int at=-1;
        if(index<0){
            System.out.println("No index found");
        }else{
            while(curr!=null){
                at++;
                if(at==index){
                    System.out.println(curr.data);
                    break;
                }
                if(curr.next==null){
                    System.out.println("Index not available");
                    break;
                }
                else{
                    curr=curr.next;
                }
            }
        }
    }
}
