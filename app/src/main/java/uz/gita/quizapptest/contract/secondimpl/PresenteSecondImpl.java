package uz.gita.quizapptest.contract.secondimpl;

import uz.gita.quizapptest.contract.MenyuContract;

public class PresenteSecondImpl implements MenyuContract.PrecenterSecond{
    private MenyuContract.ViewSecond viewSecond;
    private MenyuContract.ModelSecond modelSecond;

    public PresenteSecondImpl(MenyuContract.ViewSecond viewSecond, MenyuContract.ModelSecond modelSecond) {
        this.viewSecond = viewSecond;
        this.modelSecond = modelSecond;

    }

    @Override
    public void intentRecord() {
        viewSecond.intentRecord();
    }


    @Override
    public void intentAddQuestion() {
        viewSecond.intent(1);
    }

    @Override
    public void intentSubtractQuestion() {
        viewSecond.intent(2);
    }

    @Override
    public void intentMultiplyQuestion() {
        viewSecond.intent(3);
    }

    @Override
    public void intentDivideQuestion() {
        viewSecond.intent(4);
    }

}
