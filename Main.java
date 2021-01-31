class Main 
{
  public static void main(String[] args) 
  {
    int [][] coordinates = new int[5][5];
    //populate the array
    for(int i = 0; i <coordinates.length;i++)
    {
      for(int j = 0;j < coordinates[i].length;j++)
      {
        coordinates[i][j] =  i ;
      }//end inner for loop for the comlums
    }//end oter for loops for the rows

    //print out the array
    System.out.println ("--- Output the coordinates---");
    for (int i = 0; i < coordinates.length; i++)
    {
      for(int j = 0; j<coordinates[i].length;j++)
      {
        System.out.print (coordinates[i][j]+"\t");
      }//end inner for loop
      System.out.println("\n");
    }
    //print out the array


    for(int i = 0; i <coordinates.length;i++)
    {
      for(int j = 0;j < coordinates[i].length;j++)
      {
        coordinates[i][j] =  j;
      }//end inner for loop for the comlums
    }//end oter for loops for the rows

    //print out the array
    System.out.println ("--- 2Output the coordinates---");
    for (int i = 0; i < coordinates.length; i++)
    {
      for(int j = 0; j<coordinates[i].length;j++)
      {
        System.out.print (coordinates[i][j]+"\t");
      }//end inner for loop
      System.out.println("\n");
    }

    for(int i =0; i <coordinates.length;i++)
    {
      for(int j =0;j < coordinates[i].length;j++)
      {
        coordinates[i][j] =  5+i-j+i+i+i+i ;
      }//end inner for loop for the comlums
    }//end oter for loops for the rows

    //print out the array
    System.out.println ("--- 3Output the coordinates---");
    for (int i = 0; i < coordinates.length; i++)
    {
      for(int j = 0; j<coordinates[i].length;j++)
      {
        System.out.print (coordinates[i][j]+"\t");
      }//end inner for loop
      System.out.println("\n");
    }
  }//end main method
}//end Main Class