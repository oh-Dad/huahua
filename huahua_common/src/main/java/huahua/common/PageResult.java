package huahua.common;

import lombok.Data;

import java.util.List;
/*
* 分页
* */
@Data
public class PageResult<T> {

    private long total;

    private List<T> rows;

    public PageResult(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public PageResult() {
    }
}
