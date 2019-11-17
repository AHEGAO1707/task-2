import java.util.Scanner;
public class Kek {
      public static void Number1()
      {
          Scanner in = new Scanner(System.in);

          System.out.println("Введите первое число:");
          int n1 = in.nextInt();

          System.out.println("Введите второе число");
          int n2 = in.nextInt();

          System.out.println("Введите третье число");
          int n3 = in.nextInt();

          if (n1 == n2 || n1 == n3 || n2 == n3) {
              System.out.println("Есть одинаковые");
          }
          if (n1 != n2 & n1 !=n3 & n2 != n3) {
              System.out.println("Нет одинаковых");
          }
      }

      public static void Number2()

      {
          Scanner in = new Scanner(System.in);

          System.out.println("Введите первое число:");
          int n1 = in.nextInt();

          System.out.println("Введите второе число");
          int n2 = in.nextInt();

          System.out.println("Введите третье число");
          int n3 = in.nextInt();

          if (n1==n2 & n2==n3 & n1==n3)
              System.out.println("NO");
          if (n1 != n2 | n1 != n3 | n2 != n3)
          {
              if ((n1 >= n2 & n1 > n3) | (n1 > n2 & n1 >= n3 ))
              {
                  if (n2 < n3)
                      System.out.println(n3);
                  if (n2 > n3)
                      System.out.println(n2);
                  if (n2 == n3)
                      System.out.println(n1);
              }
              if (n2 > n1 & n2 >= n3)
              {
                  if (n1 > n3)
                      System.out.println(n1);
                  if (n1 < n3)
                      System.out.println(n3);
                  if (n1 == n3)
                      System.out.println(n2);
              }
              if (n3 > n1 & n3 > n2)
              {
                  if (n1 > n2)
                      System.out.println(n1);
                  if (n1 < n2)
                      System.out.println(n2);
                  if (n1 == n2)
                      System.out.println(n3);
              }
          }
      }
      public static void Number3()
      {
          Scanner in = new Scanner(System.in);

          int K=0;

          System.out.println("Введите первое число:");
          int n1 = in.nextInt();

          System.out.println("Введите второе число");
          int n2 = in.nextInt();

          System.out.println("Введите третье число");
          int n3 = in.nextInt();

          if (n1 >= n2 & n1 >= n3)
              K++;

          if (n2 >= n1 & n2 >= n3)
              K++;

          if (n3 >= n2 & n3 >= n1)
              K++;
          System.out.println(K);

      }
      public static void Number4()
      {
          Scanner in = new Scanner(System.in);

          float L=0;

          System.out.println("Введите число:");
          float n = in.nextFloat();

          if (n>1)
              L=n-1;

          if (n<0)
              L=-n;

          System.out.println(L);

      }
      public static void Number5()
      {
          Scanner in = new Scanner(System.in);

          System.out.println("Введите номер простого числа:");
          int n = in.nextInt();
          int P=1;
          int X=0;
          int A=0;
          int B=3;
          while(P<n)
          {
              for(int i=1;i<=B;i++)
              {
                  if(B%i==0)
                      A++;
              }
              if(A==2)
              {
                  P++;
                  X=B;
              }
              A=0;
              B=B+2;
          }
          System.out.println(X);
      }
      public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          System.out.println("Введите номер задачи:");
          int n = in.nextInt();
          while (n > 0 & n < 6)
          {
              if (n==1)
              {
                  System.out.println("Задача 1");
                  Number1();
              }
              if (n==2)
              {
                  System.out.println("Задача 2");
                  Number2();
              }
              if (n==3)
              {
                  System.out.println("Задача 3");
                  Number3();
              }
              if (n==4)
              {
                  System.out.println("Задача 4");
                  Number4();
              }
              if (n==5)
              {
                  System.out.println("Задача 5");
                  Number5();
              }
              System.out.println("Введите номер задачи:");
              n = in.nextInt();
          }
      }
}
