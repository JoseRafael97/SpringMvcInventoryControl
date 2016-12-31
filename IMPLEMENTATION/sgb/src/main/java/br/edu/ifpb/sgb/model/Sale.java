package br.edu.ifpb.sgb.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "sale")
public class Sale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private Date createDate;
	
	@OneToMany(mappedBy = "sale")
	private List<SaleItemStockProduct> products;
	
	@NotBlank
	private BigDecimal costOfFreight;
	
	@NotBlank
	private BigDecimal valueTotal;
	
	
	private BigDecimal discount;

	
	private String observation;
	
	@NotNull
	private Date deliveryDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public List<SaleItemStockProduct> getProducts() {
		return products;
	}

	public void setProducts(List<SaleItemStockProduct> products) {
		this.products = products;
	}

	public BigDecimal getCostOfFreight() {
		return costOfFreight;
	}

	public void setCostOfFreight(BigDecimal costOfFreight) {
		this.costOfFreight = costOfFreight;
	}

	public BigDecimal getValueTotal() {
		return valueTotal;
	}

	public void setValueTotal(BigDecimal valueTotal) {
		this.valueTotal = valueTotal;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((costOfFreight == null) ? 0 : costOfFreight.hashCode());
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((deliveryDate == null) ? 0 : deliveryDate.hashCode());
		result = prime * result + ((discount == null) ? 0 : discount.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((observation == null) ? 0 : observation.hashCode());
		result = prime * result + ((products == null) ? 0 : products.hashCode());
		result = prime * result + ((valueTotal == null) ? 0 : valueTotal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sale other = (Sale) obj;
		if (costOfFreight == null) {
			if (other.costOfFreight != null)
				return false;
		} else if (!costOfFreight.equals(other.costOfFreight))
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (deliveryDate == null) {
			if (other.deliveryDate != null)
				return false;
		} else if (!deliveryDate.equals(other.deliveryDate))
			return false;
		if (discount == null) {
			if (other.discount != null)
				return false;
		} else if (!discount.equals(other.discount))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (observation == null) {
			if (other.observation != null)
				return false;
		} else if (!observation.equals(other.observation))
			return false;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		if (valueTotal == null) {
			if (other.valueTotal != null)
				return false;
		} else if (!valueTotal.equals(other.valueTotal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sale [id=" + id + ", createDate=" + createDate + ", products=" + products + ", costOfFreight="
				+ costOfFreight + ", valueTotal=" + valueTotal + ", discount=" + discount + ", observation="
				+ observation + ", deliveryDate=" + deliveryDate + "]";
	}
	
	
	
}
