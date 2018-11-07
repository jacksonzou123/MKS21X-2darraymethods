public class ArrayMethods{
  public static int rowSum(int[][] ary, int x) {
    int f = 0;
    for (int i = 0; i < ary[x].length; i++) {
      f += ary[x][i];
    }
    return f;
  }

  public static int columnSum(int[][] ary, int x) {
    int f = 0;
    for (int i = 0; i < ary.length; i++) {
      if (x > ary[i].length - 1) {
        f+= 0;
      }
      else {
        f += ary[i][x];
      }
    }
    return f;
  }

  public static int[] allRowSums(int[][] ary) {
    int[] f = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      f[i] = rowSum(ary, i);
    }
    return f;
  }

  public static int[] allColSums(int[][] ary) {
    int longest = 0;
    for (int i = 0; i < ary.length; i++) {
      if (ary.length > longest) {
        longest = ary.length;
      }
    }
    int[] f = new int[longest];
    for (int i = 0; i < longest; i++) {
      f[i] = columnSum(ary, i);
    }
    return f;
  }

  public static boolean isRowMagic(int[][] ary) {
    int check = rowSum(ary, 0);
    int[] ar = allRowSums(ary);
    for (int i = 0; i < ar.length; i++) {
      if (check != ar[i]) {
        return false;
      }
    }
    return true;
  }

  public static boolean isColumnMagic(int[][] ary) {
    int check = columnSum(ary, 0);
    int[] ar = allColSums(ary);
    for (int i = 0; i < ar.length; i++) {
      if (check != ar[i]) {
        return false;
      }
    }
    return true;
  }


  public static void main(String[] args) {
    int[][] a = new int[5][10];
    a[1][2] = 6;
    System.out.println(rowSum(a,0));
    System.out.println(rowSum(a,1));
  }
}
