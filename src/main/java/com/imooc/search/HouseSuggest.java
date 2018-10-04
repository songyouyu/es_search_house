package com.imooc.search;

/**
 * @author youyusong
 * @date 2018/10/4
 */
public class HouseSuggest {

    private String input;

    /**
     * 默认权重
     */
    private int weight = 10;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
