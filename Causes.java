

public class Causes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_causes);
        ActionBar ab=getSupportActionBar();
        ab.setLogo(R.mipmap.ic_launcher3);
        ab.setDisplayUseLogoEnabled(true);
        ab.setDisplayShowHomeEnabled(true);
    }

}
