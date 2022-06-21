package com.zyz.reggie.dto;

import com.zyz.reggie.entity.Setmeal;
import com.zyz.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
