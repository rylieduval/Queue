package drive;
public class OpStack extends Stack {
    private String Ops = "+-*/";
    private char leftParenthesis = '(';
    private char rightParenthesis = ')';

    @Override
    public void push(String data) {
        this.prepend(data);
    }

    @Override
    public Node pop() {
        Node result = this.Head;
        this.removeHead();
        return result;
    }

    @Override
    public Node peek() {
        return this.Head;
    }
   
    @Override
    public static boolean isEmpty()
    {
    	if (this.Size == 0)
    	{
    		return true;
    	}
    	
    	return false;
    }
   
    @Override
    public static int getLength()
    {
    	return this.Size;
    }
   
}