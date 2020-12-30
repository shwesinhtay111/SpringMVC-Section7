Create Spring MVC Recipe Project
================================
  . Create with spring initializr
  
      Select dependencies : Web, Thymeleaf, DevTools, JPA, H2
  . Create index.html
  
  . HTTP -Hypertext Transfer Protocol
        
        - GET,POST,PUT,TRACE,OPTIONS,DELETE,CONNECT,PATCH
        - Safe Methods are GET,HEAD,OPTIONS, TRACE
        - Idempotent Methods are - PUT,DELETE and Safe Methods
        
   . One to One Mapping
        
        -@Entity
        -@Id
        -@GeneratedValue(strategy = GenerationType.IDENTITY)
        -@Lob
        -@OneToOne(cascade = CascadeType.ALL)
        -@OneToOne
 
