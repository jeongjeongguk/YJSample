import java.io.*;

class Sample7
{
    public static void main(String[] args)
    {
        try{
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));
            pw.println("Hello!");
            pw.println("GoodBye!");
            System.out.println("���Ͽ� ��ϵǾ����ϴ�.");
            pw.close();
        }
        catch(IOException e){
            System.out.println("����� ������ �߻��߽��ϴ�.");
        }
    }
}