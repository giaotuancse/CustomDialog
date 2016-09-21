package tg.customdialog;

public interface EventDialog {

    public void onDismiss(Object value);

    public void onSubmit(Object value);

    public void onCancel();
}
