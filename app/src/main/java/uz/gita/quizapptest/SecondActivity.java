package uz.gita.quizapptest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import uz.gita.quizapptest.contract.MenyuContract;
import uz.gita.quizapptest.contract.secondimpl.ModelSecondImpl;
import uz.gita.quizapptest.contract.secondimpl.PresenteSecondImpl;

public class SecondActivity extends AppCompatActivity implements MenyuContract.ViewSecond {

    private MenyuContract.PrecenterSecond precenterSecond;

    private TextView record;
    private Button btnAbout;
    private Button addQuestion;
    private Button subtractQuestion;
    private Button multiplyQuestion;
    private Button divideQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        precenterSecond = new PresenteSecondImpl(this,new ModelSecondImpl(this));
        loadViews();
    }

    public void loadViews() {
        record = findViewById(R.id.record);
        btnAbout = findViewById(R.id.about_btn);
        addQuestion = findViewById(R.id.add_question);
        subtractQuestion = findViewById(R.id.subtract_question);
        multiplyQuestion = findViewById(R.id.multiply_question);
        divideQuestion = findViewById(R.id.divide_question);


        addQuestion.setOnClickListener(v -> {
            precenterSecond.intentAddQuestion();
        });
        subtractQuestion.setOnClickListener(v -> {
            precenterSecond.intentSubtractQuestion();
        });
        multiplyQuestion.setOnClickListener(v ->{
            precenterSecond.intentMultiplyQuestion();
        });

        divideQuestion.setOnClickListener(v ->{
            precenterSecond.intentDivideQuestion();
        });
        record.setOnClickListener(v -> {
            precenterSecond.intentRecord();
        });

        btnAbout.setOnClickListener(v ->{
            Intent intent = new Intent(this,AboutActivity.class);
            startActivity(intent);
        });
    }


    @Override
    public void setRecord(int record,int totalCount) {
        this.record.setText(record+"/"+totalCount);
    }

    @Override
    public void intent(int n) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("n",n);
        startActivity(intent);
    }

//    @Override
//    public void showDialog() {
//        DialogDelet dialogDelet = new DialogDelet(this);
//        dialogDelet.setOnButtomClickListener(new DialogDelet.OnButtomClickListener() {
//            @Override
//            public void onClickOk() {
//                precenterSecond.clearRecord();
//                dialogDelet.dismiss();
//            }
//
//            @Override
//            public void onClicCencel() {
//                dialogDelet.dismiss();
//            }
//        });
//        dialogDelet.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//        dialogDelet.show();
//    }

    @Override
    public void intentRecord() {
        Intent intent = new Intent(this, RecoedActivity.class);
        startActivity(intent);
    }


}