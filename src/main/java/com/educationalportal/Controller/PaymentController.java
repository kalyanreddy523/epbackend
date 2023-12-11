package com.educationalportal.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.educationalportal.Entity.PaymentEntity;
import com.educationalportal.Repository.Paymentrepo;
import com.educationalportal.Service.PaymentService;

@RestController
@CrossOrigin( origins = { "http://localhost:3000"})
public class PaymentController {
	
	@Autowired
	Paymentrepo paymentrepo;

    @Autowired
    PaymentService paymentservice;
	
	@PostMapping("/api/payment")
	public ResponseEntity<PaymentEntity>savePayment(@RequestBody PaymentEntity payment){
		return new ResponseEntity<>(paymentrepo.save(payment),HttpStatus.CREATED);
	}
	@GetMapping("/api/payment")
	public ResponseEntity<List<PaymentEntity>>getPayments(){
		return new ResponseEntity<>(paymentrepo.findAll(),HttpStatus.OK);
	}
//	@PostMapping("/generatereceipt")
//    public void generateReceipt(@RequestBody PaymentEntity paymentEntity) {
//		paymentservice.generateReceipt(paymentEntity);
//    }
//	@GetMapping("/generatereceipt")
//	public ResponseEntity<byte[]> getReceipt() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_PDF);
//        headers.setContentDispositionFormData("attachment", "receipt.pdf");
//
//        try {
//            Path path = Paths.get("D:\\task/receipt.pdf");
//            byte[] pdfBytes = Files.readAllBytes(path);
//            return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);
//        } catch (IOException e) {
//            e.printStackTrace();
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}
