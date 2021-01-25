package GridTest;
import org.openqa.grid.selenium.GridLauncherV3;
public class StartHub {
    public static void main(String[] args) throws Exception {
        GridLauncherV3.main(new String[] { "-role", "hub", "-port", "4444" });
    }

}
