package Week11_HW2;

public class Histogram {
static public int image[][]={
 {1,3,5,7,9,3,4,4,5,6},
 {1,3,5,7,9,3,4,4,5,6},
 {1,3,5,7,9,3,4,4,5,6},
 {1,3,5,20,25,24,33,5,6,4},
 {1,3,5,20,35,24,32,5,6,4},
 {1,3,5,20,28,34,23,5,6,4},
 {1,3,5,21,25,27,23,5,6,4},
 {1,3,5,7,9,3,4,4,5,6},
 {1,3,5,7,9,3,4,4,5,6},
 {1,3,5,7,9,3,4,4,5,6},
 };
public static void main(String args[]) {
int c1 = 0;
int c2 = 0;
int c3 = 0;
for(int i = 0; i < 10; i++) {
for (int j = 0; j <10; j++) {
if(image[i][j] == 1)
c1++;
if(image[i][j] == 3)
c2++;
if(image[i][j] == 4)
c3++;
}
}
System.out.println("1 :" + c1);
System.out.println("2 :" + c2);
System.out.println("3 :" + c3);
}
}