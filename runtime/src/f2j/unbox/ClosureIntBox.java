package f2j.unbox;

public abstract class ClosureIntBox implements Closure
{
  public int x;
  public Object out;
  public abstract void apply ()
  ;
  public ClosureIntBox clone () {
      return (ClosureIntBox) ((Object) this.clone());
  }
}