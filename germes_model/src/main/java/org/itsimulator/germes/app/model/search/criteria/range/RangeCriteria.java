package org.itsimulator.germes.app.model.search.criteria.range;

import org.itsimulator.germes.app.infra.exception.flow.InvalidParameterException;

public class RangeCriteria {
    //    Page index(0-based)
    private final int page;

    //    Number of elements per page
    private final int rowCount;

    public RangeCriteria(final int page, final int rowCount) {
        if (page<0) {
            throw new InvalidParameterException("Incorrect page index: " + page);
        }
        if (rowCount<0) {
            throw new InvalidParameterException("Incorrect row count index: " + rowCount);
        }
        this.page = page;
        this.rowCount = rowCount;
    }

    public int getPage() {
        return page;
    }

    public int getRowCount() {
        return rowCount;
    }
}
