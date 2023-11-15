package drive;
public class OutputQueue extends Queue{

    @Override
    public void enqueue(String data) {
        this.append(data)
    }

    @Override
    public Node dequeue() {
        Node myNode = this.Head;
        this.removeHead;
        return myNode;
    }

    @Override
    public Node peek() {
        return this.Head;
    }

    @Override
    public boolean isEmpty(){
        if(this.getLength() == 0)
        {
        	return true;
        }
        
        return false;
    }

    @Override
    public int getLength(){
        return this.Size;
    }
}