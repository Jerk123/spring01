package net.wanho;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Jerk on 2019/5/28.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score {
    private Integer chinese;
    private Integer math;
    private Integer english;

}
