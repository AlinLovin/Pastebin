package com.pastebin.pastebin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PastebinRepository extends JpaRepository<Pastebin, Long> {

}
