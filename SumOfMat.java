class SumOfMat {
	public static void main(String args[]) {

    System.out.println("\nSum of Two Matrix is :");
          System.out.println(" \n");

      
    int array_1[][]=new int[2][2];
    int a,b;
      array_1[0][0]=10;
      array_1[0][1]=20;
      array_1[1][0]=30;
      array_1[1][1]=40;
        System.out.print("A    =");


        for(a=0;a<2;a++)
          {
            for(b=0;b<2;b++)
              System.out.print("\t" + array_1[a][b]);
                System.out.println(" ");
          }
                System.out.println(" \n");

    int array_2[][]=new int[2][2];
    int c,d;
      array_2[0][0]=50;
      array_2[0][1]=60;
      array_2[1][0]=70;
      array_2[1][1]=80;
          System.out.print("B    =");
        
        for(c=0;c<2;c++)
          {
            for(d=0;d<2;d++)
              System.out.print("\t" + +array_2[c][d]);
                System.out.println(" ");
          }
            System.out.println("____________________ ");
              System.out.print("\nSum  =");

    int sum[][]=new int[2][2];
    int x,y;
      sum[0][0]=(array_1[0][0] + array_2[0][0]);
      sum[0][1]=(array_1[0][1] + array_2[0][1]);
      sum[1][0]=(array_1[1][0] + array_2[1][0]);
      sum[1][1]=(array_1[1][1] + array_2[1][1]);
        
        for(x=0;x<2;x++)
          {
            for(y=0;y<2;y++)
              System.out.print("\t" + sum[x][y]);
                System.out.println(" ");
          }

    }  
}


