@Controller
public class IAmInControl {

    // This is a test
    @RequestMapping("/hello")
    public String helloWorld()
    {
        return "Hello Earth";
    }
}
