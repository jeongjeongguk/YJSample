import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sample3 {
    public static void main(String[] args) throws IOException {
        System.out.println("������ �Է��Ͻʽÿ�.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int res = Integer.parseInt(str);
        if (res == 1) {
            System.out.println("1�� �ԷµǾ����ϴ�.");
        } else {
            System.out.println("1 �̿��� ���� �ԷµǾ����ϴ�.");
        }
    }
}