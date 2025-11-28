//use of Multidimensional Array and forming [4 x 4] matrix...
class Matrix {
	public static void main(String args[]) {
      
    int no[][]=new int[4][4];
    int x,y;
      no[0][0]=1;
      no[0][1]=2;
      no[0][2]=3;
      no[0][3]=4;
      no[1][0]=1;
      no[1][1]=2;
      no[1][2]=3;
      no[1][3]=4;
      no[2][0]=1;
      no[2][1]=2;
      no[2][2]=3;
      no[2][3]=4;
      no[3][0]=1;
      no[3][1]=2;
      no[3][2]=3;
      no[3][3]=4;

        System.out.println("Above Matrix is 4 x 4 :");
        
         for(x=0;x<4;x++)
          {
            for(y=0;y<4;y++)
              System.out.print("\t" + no[x][y]);
                System.out.println(" ");
          }
    }  
}


