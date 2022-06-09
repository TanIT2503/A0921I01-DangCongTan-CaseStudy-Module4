package com.codegym.furamaresortspring.repository;

import java.util.List;

import com.codegym.furamaresortspring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.codegym.furamaresortspring.dto.CustomerUseServiceResortDto;

@Repository
public interface CustomerUseServiceResortRepository extends JpaRepository<Customer, Long> {
    // @Query("select Customer.customerName from Customer.c join CustomerType.ct
    // join Contract.co join ServiceResort.sr join RentType.rt join ServiceType.st
    // join ContractDetail.cd join AttachService.as")

    // cd.contractDetailId, st.serviceTypeName, as.attachServiceName
    // join CustomerType.ct join Contract.ctr join ServiceResort.sr join RentType.rt
    // join ServiceType.st join ContractDetail.cd join AttachService.as
    @Query(value = "select c.customer_id, c.customer_name, ct.customer_type_name, ctr.contract_id, sr.service_resort_name, rt.rent_type_name, cd.contact_detail_id, st.service_type_name, at.attach_service_name From customer c left join customer_type ct on c.customer_type_id_customer_type_id = ct.customer_type_id  left join contract ctr on c.customer_id = ctr.customer_id_customer_id left join service_resort sr on sr.service_resort_id = ctr.service_resort_id_service_resort_id left join rent_type rt on rt.rent_type_id = sr.rent_type_id_rent_type_id left join contract_detail cd on cd.contract_id_contract_id = ctr.contract_id left join service_type st on st.service_type_id = sr.service_type_id_service_type_id left join attach_service at on at.attach_service_id = cd.attach_service_id_attach_service_id", nativeQuery = true)
    List<CustomerUseServiceResortDto> findAllCustomer();
}
