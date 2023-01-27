package uz.gita.quizapptest.contract;

public interface MenyuContract {

    interface ViewSecond{
        void setRecord(int record,int totalCount);

        void intent(int n);

//        void showDialog();

        void intentRecord();
    }

    interface ModelSecond{


    }

    interface PrecenterSecond{

        void intentAddQuestion();
        void intentSubtractQuestion();
        void intentMultiplyQuestion();
        void intentDivideQuestion();
        void intentRecord();
    }
}
