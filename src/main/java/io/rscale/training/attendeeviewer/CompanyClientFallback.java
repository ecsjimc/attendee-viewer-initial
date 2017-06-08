package io.rscale.training.attendeeviewer;

import org.springframework.stereotype.Component;

@Component
public class CompanyClientFallback implements CompanyClient {

	public CompanyClientFallback() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Company getCompany(String id) {
		// TODO Auto-generated method stub
		return new Company();
	}

}
