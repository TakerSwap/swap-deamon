/**
 * MIT License
 * <p>
 * Copyright (c) 2017-2018 nuls.io
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package network.nerve.swap.model.business.stable;

import network.nerve.swap.model.business.BaseBus;

import java.math.BigInteger;

/**
 * @author: PierreLuo
 * @date: 2021/4/1
 */
public class StableAddLiquidityBus extends BaseBus {

    private byte[] from;
    /**
     * 实际添加的资产
     */
    private BigInteger[] realAmounts;
    /**
     * 获得的LP资产
     */
    private BigInteger liquidity;
    /**
     * 当前池子余额（添加前）
     */
    private BigInteger[] balances;
    /**
     * 最终退回给用户的资产
     */
    private BigInteger[] refundAmounts;
    /**
     * 接收LP资产的地址
     */
    private byte[] to;

    public StableAddLiquidityBus() {
    }

    public StableAddLiquidityBus(byte[] from, BigInteger[] realAmounts, BigInteger liquidity, BigInteger[] balances, BigInteger[] refundAmounts, byte[] to) {
        this.from = from;
        this.realAmounts = realAmounts;
        this.liquidity = liquidity;
        this.balances = balances;
        this.refundAmounts = refundAmounts;
        this.to = to;
    }

    public byte[] getFrom() {
        return from;
    }

    public void setFrom(byte[] from) {
        this.from = from;
    }

    public BigInteger[] getRealAmounts() {
        return realAmounts;
    }

    public void setRealAmounts(BigInteger[] realAmounts) {
        this.realAmounts = realAmounts;
    }

    public BigInteger getLiquidity() {
        return liquidity;
    }

    public void setLiquidity(BigInteger liquidity) {
        this.liquidity = liquidity;
    }

    public BigInteger[] getBalances() {
        return balances;
    }

    public void setBalances(BigInteger[] balances) {
        this.balances = balances;
    }

    public BigInteger[] getRefundAmounts() {
        return refundAmounts;
    }

    public void setRefundAmounts(BigInteger[] refundAmounts) {
        this.refundAmounts = refundAmounts;
    }

    public byte[] getTo() {
        return to;
    }

    public void setTo(byte[] to) {
        this.to = to;
    }
}
