package company.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="languages")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","knownLanguages"})

public class Language {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "language_id")
	private int languageId;
	
	@Column(name = "language_name")
	@NotBlank
	@NotNull
	private String languageName;
	
	@OneToMany(mappedBy="language")
	private List<KnownLanguage> knownLanguages;
	
}
