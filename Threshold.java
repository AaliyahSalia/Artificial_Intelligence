package Week11_HW2;

public class Threshold {
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
for(int i = 0; i < 10; i++) {
for (int j = 0; j <10; j++) {
if(image[i][j] < 20)
image[i][j]=0;
else
image[i][j]=1;
}
}
for(int q= 0; q<10; q++) {
 
 System.out.println( image[q][0]+" "+ image[q][1]+" "+image[q][2]+" "+image[q][3]+" "+image[q][4] +" "+image[q][5]+" "+image[q][6]+" "+image[q][7]+" "+image[q][8]+" "+image[q][9]);

}
}
}