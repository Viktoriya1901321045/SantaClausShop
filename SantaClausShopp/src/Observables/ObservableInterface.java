package Observables;


public interface ObservableInterface {
	public void assignGnomeToMagicPlank(ObserverInterface gnome);
    public void releaseGnomeFromMagicPlank(String gnomeName);
    public void notifyAllGnomes();
}
