
package com.example.demo.controller.vue;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

import com.example.demo.entity.vue.VueBoard;
import com.example.demo.service.vue.VueBoardService;

@Log
@RestController
@RequestMapping("/boards")
//8080포트에서 들어오는 모든 요청을 허락하겠다는 뜻 이거 없으면 뷰와 스프링이 연결이 안됨 에러 발생
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class VueBoardController {
    //static final Logger log = LoggerFactory.getLogger(VueBoardController.class);

    @Autowired
    private VueBoardService service;

    //GET은 사용자 전체 조회 / POST는 추가 / PUT은 추가 & 수정 / DELETE는 삭제 시 주로 사용
    //url을 동적으로 만들기 위해 이렇게 쓰며 '/{ }'' 그리고 pathVariable사용
    @GetMapping("/{boardNo}")

    //기존 Controller 코드의 RestController 반환값은 모두 Object 타입이었다. 
    //하지만, 일반적인 API는 반환하는 리소스에 Value만 있지 않다는 것을 모두 알고 있을 것이다. 
    //당장 생각나는 것으로는 상태코드, 응답 메시지 등이 포함될 수 있겠다.
    //그럴때 사용되는 것이 ResponseEntity Class 이다.
    public ResponseEntity<VueBoard> read(

        // url경로에 변수를 넣어주는것 주의사항: null이나 공백값이 들어가는 parameters에는 사용하지 말자 ! 
        // 값을 넘겨 받을때 .이 있으면 .포함 되고 그 뒤가 잘려서 들어옴
            @PathVariable("boardNo") Long boardNo) throws Exception {
        log.info("read()");

        VueBoard board = service.read(boardNo);
        System.out.println("VueBoardController: " + board);

        return new ResponseEntity<VueBoard>(board, HttpStatus.OK);
    }

    @GetMapping("")
    // HTTPEntity 클래스(HTTP요청 또는 응답에 해당하는 클래스)를 상속받은 클래스이다 
    // 사용자의 HttpRequest에 대한 응답 데이터를 포함하는 클래스
    public ResponseEntity<List<VueBoard>> list() throws Exception {
        log.info("list()");

        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<VueBoard> register(
            @Validated @RequestBody VueBoard board,
            UriComponentsBuilder uriBuilder) throws Exception {
        log.info("POST register()");

        service.register(board);

        log.info("register board.getBoardNo() = " + board.getBoardNo());

        /*
        URI resourceURI = uriBuilder.path("boards/{boardNo}")
                .buildAndExpand(board.getBoardNo())
                .encode()
                .toUri();
        return ResponseEntity.created(resourceURI).build();
         */

        return new ResponseEntity<>(board, HttpStatus.OK);
    }

    @DeleteMapping("/{boardNo}")
    public ResponseEntity<Void> remove(
            @PathVariable("boardNo") Long boardNo) throws Exception {
        log.info("remove");

        service.remove(boardNo);

        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{boardNo}")
    public ResponseEntity<VueBoard> modify(
            @PathVariable("boardNo") Long boardNo,
            @Validated @RequestBody VueBoard board) throws Exception {
        log.info("Put - modify()");
        System.out.println(board);

        board.setBoardNo(boardNo);
        service.modify(board);

        return new ResponseEntity<>(board, HttpStatus.OK);
    }
}