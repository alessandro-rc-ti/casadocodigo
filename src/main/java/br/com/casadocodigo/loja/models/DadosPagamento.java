/**
 *
 */
package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;

/**
 * @author alessandro
 *
 */
public class DadosPagamento {

	private BigDecimal value;

	public DadosPagamento(BigDecimal value) {
		this.value = value;
	}
	
	public BigDecimal getValue() {
		return value;
	}

	public DadosPagamento() {
    }

}
