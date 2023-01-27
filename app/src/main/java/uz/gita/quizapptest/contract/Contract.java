package uz.gita.quizapptest.contract;

public interface Contract {

    interface RecordView{
        void setRecord(int[] n);
    }

    interface RecordModel{
       int[] readRecord();

    }

    interface RecordPresenter{
        void setRecord();
    }
}
