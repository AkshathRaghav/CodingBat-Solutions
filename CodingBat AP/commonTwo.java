commonTwo - 

public int commonTwo(String[] a, String[] b) {
  int count = 0;
  String check  = "";
  for (int i = 0; i < b.length; i++) {
    for (int j = 0; j < a.length; j++) {
      if (a[j].equals(b[i]) && check.indexOf(a[j]) == -1) {
        check += a[j];
        count++;
      }
    }
  }

  return count;

      
}
