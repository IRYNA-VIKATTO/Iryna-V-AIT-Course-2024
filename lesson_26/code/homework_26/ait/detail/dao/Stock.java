package homework_26.ait.detail.dao;

import homework_26.ait.detail.model.Detail;

public interface Stock {
    void addDetail(Detail detail);

    Detail findDetailByBarCode(long barCode);

    void updateDetail(Detail detail);

    Detail removeDetail(long barCode);

    Detail updateDetail(long barCode, Detail newDetail);

    int quantity();

    void printDetails();

    double getTotalWeight();

    double getAverageWeight();

    Detail[] findDetailsByWeightRange(double min, double max);
}
