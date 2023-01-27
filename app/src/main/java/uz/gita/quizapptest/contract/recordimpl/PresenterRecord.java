package uz.gita.quizapptest.contract.recordimpl;

import uz.gita.quizapptest.contract.Contract;

public class PresenterRecord implements Contract.RecordPresenter {

    private Contract.RecordView view;
    private Contract.RecordModel model;

    public PresenterRecord(Contract.RecordView view, Contract.RecordModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void setRecord() {
        int[] ints = model.readRecord();
        view.setRecord(ints);
    }
}
