import java.util.List;

//---------------------------------------------------------------//
public class AdjacencyMatrix {
  //-------------------------------------------------------------//
  public  static int inDegree(int k, int[][] m){
    //TODO: implement
    int indegree=0;
    for(int i=0; i<m.length; i++){
      if(m[i][k]==1){
        indegree+=1;
      }
    }
    return indegree;
  }

  //-------------------------------------------------------------//
  public  static int outDegree(int k, int[][] m){
    //TODO: implement
    int outdegree=0;
    for(int i=0; i<m.length; i++){
      if(m[k][i]==1){
        outdegree+=1;
      }
    }
    return outdegree;
  }

  //-------------------------------------------------------------//
  public  static List<Integer> adjacent(int k, int[][] m){
    //TODO: implement
    List<Integer> adjacent=null;
    for(int i=0;i<m.length;i++){
      if(m[k][i]==1 || m[i][k]==1){
        adjacent.add(i);
      }
    }
    return adjacent;
  }

  //-------------------------------------------------------------//
  public static boolean hasTriangle(int[][] m) {
    //TODO: implement
    int V = m.length;
    boolean isTriangle=false;
    int count=0;
    for (int i = 0; i < V; i++)
    {
      for (int j = 0; j < V; j++)
      {
        for (int k=0; k<V; k++)
        {
          if (m[i][j] == 1 && m[j][k] == 1 && m[k][i] == 1){
            count++;
          }
        }
      }
    }
    if(count/3>=1){
      isTriangle=true;
    }
    else
    {
      isTriangle=false;
    }
    return isTriangle;
  }

  //-------------------------------------------------------------//
  public static void main(String args[]) {
    //TODO: test your code
  }
}
