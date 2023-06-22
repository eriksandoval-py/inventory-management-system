package com.eriksandoval.inventorymanagementsystem.collection;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Technician implements Employee, Observer{
        
        @Override
        public void update() {
            // TODO Auto-generated method stub
            
        }
        @Override
        public void showEmployeeDetails() {
            // TODO Auto-generated method stub
            
        }
        

    
}
