// See https://checkmarx.atlassian.net/wiki/spaces/PTS/pages/244745556/Creating+Custom+Flows+CustomFlows
//
// On CxSAST 9.4, this seems to work OOTB.
import java.util.logging.Logger;

public class Logger
{
    private static final Logger LOGGER = Logger.getLogger(Thread.currentThread().getStackTrace()[0].getClassName());

    public static void main(String[] args)
    {
        //PII
        Node n = new Node("patient health info", 12345);
        LOGGER.info("Oh no!  This is bad! " + n.getS2());
    }//end main
}//end class

class Node
{
    private String s2 = null;
    private int id = -1;

    public Node(String s, int ID)
    {
        this.s2 = s;
        this.id = ID;
    }//end constructor

    public String getS2()
    {
        return this.s2;
    }//end getS2
}//end class
