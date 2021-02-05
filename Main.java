class Main 
{
  public static void main(String[] args) 
  {
    //initalizes the 2D Array
    int [][] fun2DArrays = new int[5][5];
    System.out.println ("Andy Sanchez, PP 6.6 fun2DArrays");
    System.out.println();//space
   // populate the array
    for(int i = 0; i <fun2DArrays.length;i++)//for loop format
    {
      for(int j = 0;j < fun2DArrays[i].length;j++)//for loop format
      {
        fun2DArrays[i][j] =  i ;//this is the logic
      }//end inner for loop for the comlums
    }//end oter for loops for the rows

    //print out the array
    System.out.println ("--- Problem 2---");//format
    for (int i = 0; i < fun2DArrays.length; i++)//for loop format
    {
      for(int j = 0; j<fun2DArrays[i].length;j++)//for loop format
      {
        System.out.print (fun2DArrays[i][j]+"\t");//prints out
      }//end inner for loop
      System.out.println("\n");//just to format
    }
    //print out the array


    for(int i = 0; i <fun2DArrays.length;i++)//for loop format
    {
      for(int j = 0;j < fun2DArrays[i].length;j++)//for loop format
      {
        fun2DArrays[i][j] =  j;//this is the logic
      }//end inner for loop for the comlums
    }//end oter for loops for the rows

    //print out the array
    System.out.println ("--- Problem 1---");//format
    for (int i = 0; i < fun2DArrays.length; i++)//for loop format
    {
      for(int j = 0; j<fun2DArrays[i].length;j++)//for loop format
      {
        System.out.print (fun2DArrays[i][j]+"\t");//prints out
      }//end inner for loop
      System.out.println("\n");//just to format
    }

    for(int i =0; i <fun2DArrays.length;i++)//for loop format
    {
      for(int j =0;j < fun2DArrays[i].length;j++)//for loop format
      {
        fun2DArrays[i][j] =  5+i-j+i+i+i+i;//this is the logic
      }//end inner for loop for the comlums
    }//end oter for loops for the rows

    //print out the array
    System.out.println ("--- Problem 3---");//format
    for (int i = 0; i < fun2DArrays.length; i++)//for loop format
    {
      for(int j = 0; j<fun2DArrays[i].length;j++)//for loop format
      {
        System.out.print (fun2DArrays[i][j]+"\t");//prints out
      }//end inner for loop
      System.out.println("\n");//just to format
    }
//Number 9 this is just me trying it out
// int x =0;
//     for(int i =0; i <fun2DArrays.length;i++)
//     {
//       for(int j =0;j < fun2DArrays[i].length;j++)
//       {
//         fun2DArrays[i][j] = x+1;
//         x++;
//         if (j<i)
//         {
         
//           x = i+16+j;
//         }
//       }//end inner for loop for the comlums
//     }//end oter for loops for the rows

//     //print out the array
//     System.out.println ("--- 3Output the coordinates---");
//     for (int i = 0; i < fun2DArrays.length; i++)
//     {
//       for(int j = 0; j<fun2DArrays[i].length;j++)
//       {
//         System.out.print (fun2DArrays[i][j]+"\t");
//       }//end inner for loop
//       System.out.println("\n");
//     }
  }//end main method
}//end Main Class